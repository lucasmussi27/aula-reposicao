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
  //Como não se trata de um tipo primitivo, deve ser mostrado para a entidade como tratar esse tipo 
  private Aluno aluno;
  @ManyToOne
  private Aula aula;
  //Como não se trata de um tipo primitivo, deve ser mostrado para a entidade como tratar esse tipo 
  private Date horarioReposicao;
  //Como não se trata de um tipo primitivo, deve ser mostrado para a entidade como tratar esse tipo 
  private Presenca presenca;
  //Como não se trata de um tipo primitivo, deve ser mostrado para a entidade como tratar esse tipo 
  private Sincronismo sincronismo;
}
