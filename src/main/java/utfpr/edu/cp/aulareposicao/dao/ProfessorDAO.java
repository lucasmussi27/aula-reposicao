package utfpr.edu.cp.aulareposicao.dao;
import utfpr.edu.cp.aulareposicao.model.Professor;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ProfessorDAO extends JpaRepository<Professor, Long> {}
