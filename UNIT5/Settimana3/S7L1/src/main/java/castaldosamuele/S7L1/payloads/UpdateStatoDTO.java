package castaldosamuele.S7L1.payloads;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;

public record UpdateStatoDTO(@NotEmpty(message = "Lo stato è obbligatorio")
                              @Pattern(regexp = "^(in programma|completato)$", message = "Lo stato deve essere 'in programma' o 'completato'")
                              String stato) {
}
