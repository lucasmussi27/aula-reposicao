package utfpr.edu.cp.aulareposicao.model;
import java.io.Serializable;
import javax.persistence.*;
import lombok.*;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Aluno implements Serializable {
  @Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
  private Long id;
  private String nome;
  private String ra;
}
