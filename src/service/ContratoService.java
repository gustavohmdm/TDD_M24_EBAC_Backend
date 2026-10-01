package service;

import dao.IContratoDao;

/**
 * @author gustavohmdm
 */

public class ContratoService {

    private IContratoDao contratoDao;

    public ContratoService(IContratoDao contratoDao) {
        this.contratoDao = contratoDao;
    }

    public String salvar() {
        contratoDao.salvar();
        return "Sucesso";
    }

    public String excluir() {
        contratoDao.excluir();
        return "Sucesso";
    }

    public String alterar() {
        contratoDao.alterar();
        return "Sucesso";
    }

    public String buscar() {
        contratoDao.buscar();
        return "Sucesso";
    }
}
