package spittr.test;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.servlet.view.InternalResourceView;
import spittr.Spittle;
import spittr.data.SpittleRepository;
import spittr.web.HomeController;
import spittr.web.SpittleController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.matchers.JUnitMatchers.hasItems;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

public class HomeControllerTest {
    @Test
    public void testHomePage() throws Exception {
        HomeController controller=new HomeController();
        MockMvc mockMvc=standaloneSetup(controller).build();
        mockMvc.perform(get("/"))
                .andExpect(view().name("home"));
    }
    @Test
    public void shouldShowRecentSpittles() throws Exception {
        List<Spittle> expectedSpittles=createSpittleList(20);
        SpittleRepository mockRepository=mock(SpittleRepository.class);
        when(mockRepository.findSpittles(Long.MAX_VALUE,20)).thenReturn(expectedSpittles);
        SpittleController controller=new SpittleController(mockRepository);
        MockMvc mockMvc=standaloneSetup(controller)
                .setSingleView(new InternalResourceView("/WEB-INF/views/spittles.jsp"))
                .build();
        mockMvc.perform(get("/spittles"))
        .andExpect(view().name("spittles"))
        .andExpect(model().attributeExists("spittleList"))
        .andExpect(model().attribute("spittleList",hasItems(expectedSpittles.toArray())));

    }
    private List<Spittle> createSpittleList(int count) {
        List<Spittle> spittles=new ArrayList<Spittle>();
        for(int i=0;i<count;i++){
            spittles.add(new Spittle(new Date(),"Spittle"+ i));
        }
        return  spittles;
    }
    @Test
    public void testSpittle() throws Exception {
        Spittle expectedSpittle = new Spittle(new Date(),"Hello");
        SpittleRepository mockRepository = mock(SpittleRepository.class);
        when(mockRepository.findOne(12345)).thenReturn(expectedSpittle);

        SpittleController controller = new SpittleController(mockRepository);
        MockMvc mockMvc = standaloneSetup(controller).build();

        mockMvc.perform(get("/spittles/12345"))
                .andExpect(view().name("spittle"))
                .andExpect(model().attributeExists("spittle"))
                .andExpect(model().attribute("spittle", expectedSpittle));
    }
}
