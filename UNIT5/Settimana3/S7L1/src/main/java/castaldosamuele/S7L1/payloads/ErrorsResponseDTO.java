package castaldosamuele.S7L1.payloads;

import java.time.LocalDateTime;

public record ErrorsResponseDTO(String message, LocalDateTime timestamp) {
}
