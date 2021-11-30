package model.dao;

public interface InterfacePersistencia {
    Boolean conexaoAberta();
    void fecharConexao();
}
