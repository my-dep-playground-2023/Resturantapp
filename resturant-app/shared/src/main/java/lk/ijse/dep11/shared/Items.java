package lk.ijse.dep11.shared;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Items implements Serializable {
    private  int appa;
    private  int banis;
    private  int kottu;
    private  int rice;



}
