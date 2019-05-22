package utfpr.edu.cp.aulareposicao.model;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import lombok.*;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Reposicao implements Serializable {
  @Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
  private Long id;
  private Aluno aluno;
  @ManyToOne
  private Aula aula;
  private Date horarioReposicao;
  private Presenca presenca;
  private Sincronismo sincronismo;
}
