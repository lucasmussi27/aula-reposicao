package utfpr.edu.cp.aulareposicao.model;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.*;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Aula implements Serializable {
  @Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
  private Long id;
  private String conteudo;
  private Professor professor;
  @OneToMany
  private List<Reposicao> reposicoes;
  private Date horario;
}
