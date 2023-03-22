import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.domain.Auditable;

import java.io.Serializable;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)

public class Car extends Auditable<String> implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String modelName;
    private String color;
    private String bodyType;

    private int yearOfProd;
    private int mileage;
    private int amount;
    private boolean isBooked;

}