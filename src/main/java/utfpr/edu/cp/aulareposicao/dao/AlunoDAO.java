package utfpr.edu.cp.aulareposicao.dao;
import utfpr.edu.cp.aulareposicao.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
public interface AlunoDAO extends JpaRepository<Aluno, Long> {}
