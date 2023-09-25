package lk.ijse.dep11.shared;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class customer {
    private  String id;
    private String name;
    private String contactNumber;
    private  Items item;

}
