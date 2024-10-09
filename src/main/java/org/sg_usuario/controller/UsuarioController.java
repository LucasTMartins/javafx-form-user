package org.sg_usuario.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import org.sg_usuario.model.Contato;
import org.sg_usuario.model.Usuario;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class UsuarioController implements Initializable {
    @FXML
    private HBox pnTitulo;
    @FXML
    private GridPane pnForm;
    @FXML
    private HBox pnButtons;

    @FXML
    private Label lbTitulo;
    @FXML
    private Label lbNome;
    @FXML
    private Label lbCpf;
    @FXML
    private Label lbGenero;
    @FXML
    private Label lbEmail;
    @FXML
    private Label lbCelular;
    @FXML
    private Label lbPerfil;

    @FXML
    private TextField txtNome;
    @FXML
    private TextField txtCpf;
    @FXML
    private TextField txtEmail;
    @FXML
    private TextField txtCelular;

    @FXML
    private RadioButton rbMasculino;
    @FXML
    private RadioButton rbFeminino;
    @FXML
    private ToggleGroup tgGenero;
    @FXML
    private ComboBox<String> cbPerfil;
    private ObservableList<String> obsListPerfil;

    @FXML
    private Button btnSalvar;
    @FXML
    private Button btnLimpar;

    private Usuario usuario;
    private Contato contato;

    @FXML
    public void onBtnSalvarAction(){
        this.usuario.setNome(txtNome.getText());
        this.usuario.setCpf(txtCpf.getText());
        RadioButton radioButton = (RadioButton) this.tgGenero.getSelectedToggle();
        this.usuario.setGenero(radioButton.getText());
        this.contato.setCelular(txtCelular.getText());
        this.contato.setEmail(txtEmail.getText());
        this.usuario.setContato(this.contato);
        this.usuario.setPerfil(this.cbPerfil.getSelectionModel().getSelectedItem());
        System.out.println(this.usuario.toString());
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle){
        this.usuario = new Usuario();
        this.contato = new Contato();
        List<String> listPerfil = new ArrayList<String>();

        listPerfil.add("Aluno");
        listPerfil.add("Professor");
        listPerfil.add("Coordenador");
        listPerfil.add("Administratico");
        listPerfil.add("Direcao");
        this.obsListPerfil = FXCollections.observableList(listPerfil);

        cbPerfil.setItems(this.obsListPerfil);
    }
}