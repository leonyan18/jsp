package spittr.data;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import spittr.Spittle;
@Component
public class TestSpittleRepository implements SpittleRepository {
  @Override
  public List<Spittle> findSpittles(long max, int count) {

    return creatSpittleList(20);
  }

  @Override
  public Spittle findOne(long id) {
    return new Spittle(new Date(),"Spittle"+ id,2121.0,1212.0);
  }

  private List<Spittle> creatSpittleList(int count) {
    List<Spittle> spittles=new ArrayList<Spittle>();
    for(int i=0;i<count;i++){
      spittles.add(new Spittle(new Date(),"Spittle"+ i,2121.0,1212.0));
    }
    return  spittles;
  }
}
