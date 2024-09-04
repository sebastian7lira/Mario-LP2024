/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewControle;

import bean.ClienteMsl;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Sebas
 */
public class ClienteControle extends AbstractTableModel {
    List lista;
    
    
    public void setList(List lista){
        this.lista = lista;
        //System.out.println("setlist");
        //atualizar
        this.fireTableDataChanged();
    }
    public ClienteMsl getBean(int linha){
        //System.out.println("getbean");
        return (ClienteMsl) lista.get(linha);
    }
    @Override
    public int getRowCount() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        //System.out.println("rowcount");
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        //System.out.println("columncount");
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates. return
        ClienteMsl cliente = (ClienteMsl) lista.get(rowIndex);
        //System.out.println("getvalueat" + rowIndex + "e" + columnIndex);

        if (columnIndex == 0) {
            return cliente.getIdclienteMsl();
        }
        if (columnIndex == 1) {
            return cliente.getNomeMsl();
        }
        if (columnIndex == 2) {
            return cliente.getCpfMsl();
        }
        if (columnIndex == 3) {
            return cliente.getCidadeMsl();
        }

        return "conteudo";
    }

    @Override
    public String getColumnName(int column) {
        //colocar o nome nos campos
        if (column == 0) {
            return "Id";
        }
        if (column == 1) {
            return "Nome";
        }
        if (column == 2) {
            return "CPF";
        }
        if (column == 3) {
            return "Cidade";
        }
        return "";
    }
}
