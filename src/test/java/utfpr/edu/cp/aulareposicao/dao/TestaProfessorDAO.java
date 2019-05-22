package utfpr.edu.cp.aulareposicao.dao;
import org.junit.*;
import utfpr.edu.cp.aulareposicao.model.Professor;

public class TestaProfessorDAO {
  private static ProfessorDAO dao;

  @Test
  public void testaInserir() {
    Professor prof = Professor.builder()
                  .nome("Lucas Mussi")
                  .ra("1884891")
                  .build();
    Assert.assertTrue(dao.save(prof));
  }

  @Test
  public void testaListar() {
    Professor prof = Professor.builder()
                  .nome("Kurt Cobain")
                  .ra("1991095")
                  .build();
    dao.save(prof);
    Assert.assertTrue(dao.findAll().size() > 0);
  }

  @Test
  public void testaExcluir() {
    Professor prof = Professor.builder()
                  .nome("Layne Staley")
                  .ra("1995084")
                  .build();
    dao.save(prof);
    int size = dao.findAll().size();
    Professor tira = dao.findAll().stream()
                   .filter(e -> e.getNome().equals(prof.getNome()))
                   .findAny().orElseThrow(RuntimeException::new);
    dao.deleteById(tira.getId());
    Assert.assertTrue(dao.findAll().size() < size);
  }
}
