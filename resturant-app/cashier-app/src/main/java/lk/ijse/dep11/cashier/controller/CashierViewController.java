package lk.ijse.dep11.cashier.controller;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import lk.ijse.dep11.shared.Items;
import lk.ijse.dep11.shared.Table1;
import lk.ijse.dep11.shared.customer;

public class CashierViewController {

    @FXML
    private Button btnNewOrder;

    @FXML
    private Button btnPlaceOrder;

    @FXML
    private AnchorPane root;

    @FXML
    private TableView<Table1> tblOrderDetails;

    @FXML
    private Spinner<Integer> txtAppa;

    @FXML
    private Spinner<Integer> txtBanis;

    @FXML
    private TextField txtContactNumber;

    @FXML
    private Spinner<Integer> txtKottu;

    @FXML
    private TextField txtName;

    @FXML
    private Spinner<Integer> txtRice;

    public void initialize(){
        tblOrderDetails.getColumns().get(0).setCellValueFactory(new PropertyValueFactory<>("id"));
        tblOrderDetails.getColumns().get(1).setCellValueFactory(new PropertyValueFactory<>("name"));
        tblOrderDetails.getColumns().get(2).setCellValueFactory(new PropertyValueFactory<>("status"));

        txtAppa.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(0,100,0));
        txtAppa.valueProperty().addListener(e ->{
            txtAppa.getValue();
            System.out.println(txtAppa.getValue());

        });

        txtRice.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(0,100,0));
        txtRice.valueProperty().addListener(e ->{
            txtRice.getValue();
            System.out.println(txtRice.getValue());

        });

        txtBanis.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(0,100,0));
        txtBanis.valueProperty().addListener(e ->{
            txtBanis.getValue();
            System.out.println(txtBanis.getValue());

        });

        txtKottu.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(0,100,0));
        txtKottu.valueProperty().addListener(e ->{
            txtKottu.getValue();
            System.out.println(txtKottu.getValue());

        });



    }

    @FXML
    void btnNewOrderOnAction(ActionEvent event) {
        txtName.clear();
        txtContactNumber.clear();

    }

    @FXML
    void btnPlaceOrderOnAction(ActionEvent event) {
        var newCustomer = new customer("1",txtName.getText(),txtContactNumber.getText(),new Items(txtAppa.getValue(),txtBanis.getValue(),txtKottu.getValue(),txtRice.getValue()));
        var newTableDetail = new Table1("1",txtName.getText(),"Getting ready");
        ObservableList<Table1> orders = tblOrderDetails.getItems();
        orders.add(newTableDetail);
    }

}
