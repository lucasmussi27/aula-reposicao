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
  //Como se trata de um tipo nao primitivo, deveria ser colocado uma forma de mostrar ao banco como agir com essa variavel
  private Aluno aluno;
  @ManyToOne
  private Aula aula;
  //Como se trata de um tipo nao primitivo, deveria ser colocado uma forma de mostrar ao banco como agir com essa variavel
  private Date horarioReposicao;
  //Como se trata de um tipo nao primitivo, deveria ser colocado uma forma de mostrar ao banco como agir com essa variavel
  private Presenca presenca;
  //Como se trata de um tipo nao primitivo, deveria ser colocado uma forma de mostrar ao banco como agir com essa variavel
  private Sincronismo sincronismo;
}
