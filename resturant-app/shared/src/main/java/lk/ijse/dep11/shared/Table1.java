package lk.ijse.dep11.shared;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Table1 implements Serializable {
    public String id;

    public String name;

    public String status;

}
