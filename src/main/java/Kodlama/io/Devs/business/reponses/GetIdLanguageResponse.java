package Kodlama.io.Devs.business.reponses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetIdLanguageResponse {
    private int id;
    private String language;
}
