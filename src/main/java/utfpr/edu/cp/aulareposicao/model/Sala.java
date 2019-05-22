package utfpr.edu.cp.aulareposicao.model;
import java.io.Serializable;
import javax.persistence.*;
import lombok.*;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Sala implements Serializable {
  @Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
  private Long id;
  private String codigo;
}
