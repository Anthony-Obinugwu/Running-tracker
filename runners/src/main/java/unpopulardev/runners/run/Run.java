package unpopulardev.runners.run;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Positive;


import java.time.LocalDateTime;

public record Run(Integer id,
                  @NotEmpty
                  String title,
                  LocalDateTime startedOn,
                  LocalDateTime completedOn,
                  @Positive
                  Integer miles,
                  Location location
) {

    public Run {
        if (completedOn != null && !completedOn.isAfter(startedOn)){
            throw new IllegalArgumentException("Completed on must be after started on");
        }
        if(title.isEmpty()){
            throw new IllegalArgumentException("Title must not be empty");
        }
    }
}