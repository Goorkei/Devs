package Kodlama.io.Devs.business.reponses.subTechnology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllSubTechnologyResponse {
    private int id;
    private String name;
    private int languageId;
}
