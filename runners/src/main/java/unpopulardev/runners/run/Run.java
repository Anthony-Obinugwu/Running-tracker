package unpopulardev.runners.run;

import org.springframework.cglib.core.Local;
import org.xml.sax.Locator;

import java.time.LocalDateTime;

public record Run(Integer id,
                  String title,
                  LocalDateTime startedOn,
                  LocalDateTime completedOn,
                  Integer miles,
                  Location location
) {}
