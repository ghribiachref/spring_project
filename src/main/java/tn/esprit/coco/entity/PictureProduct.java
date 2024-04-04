package tn.esprit.coco.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class PictureProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY  )
    private Long idpicture;
    private Date dateAdded;
    private String Format;
    private String Path;





    @ManyToOne
    private Product product;
}
