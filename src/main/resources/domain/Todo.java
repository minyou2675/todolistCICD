package domain;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter@Setter
public class Todo {
        private Long id;
        private String title;
        private boolean completed;

        // 생성자, getter, setter, toString 등의 메서드 생략

}
