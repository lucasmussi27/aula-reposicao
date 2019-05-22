package utfpr.edu.cp.aulareposicao.dao;
import org.junit.*;
import utfpr.edu.cp.aulareposicao.model.Sala;
import utfpr.edu.cp.aulareposicao.dao.SalaDAO;
public class TestaSalaDAO {
  private static SalaDAO dao;

  @Test
  public void testaInserir() {
    Sala sala = Sala.builder()
                  .codigo("A105")
                  .build();
    Assert.assertTrue(dao.save(sala));
  }

  @Test
  public void testaListar() {
    Sala sala = Sala.builder()
                  .codigo("K008")
                  .build();
    dao.save(sala);
    Assert.assertTrue(dao.findAll().size() > 0);
  }

  @Test
  public void testaExcluir() {
    Sala sala = Sala.builder()
                  .codigo("P209")
                  .build();
    dao.save(sala);
    int size = dao.findAll().size();
    Sala tira = dao.findAll().stream()
                   .filter(e -> e.getCodigo().equals(sala.getCodigo()))
                   .findAny().orElseThrow(RuntimeException::new);
    
    dao.deleteById(tira.getId());
    Assert.assertTrue(dao.findAll().size() < size);
  }
}
