package mbat.master.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OptionDTO {
    private Long questionId;
    private String optionText;
    private Boolean isCorrect;

    // Getter ve setter metodları
}
