import dao.ContratoDao;
import dao.IContratoDao;
import mock.ContratoDaoMock;
import org.junit.Assert;
import org.junit.Test;
import service.ContratoService;

/**
 * @author gustavohmdm
 */

public class ContratoServiceTest {

    @Test
    public void salvarTest() {
        IContratoDao dao = new ContratoDaoMock();
        ContratoService service = new ContratoService(dao);
        String retorno1 = service.salvar();
        String retorno2 = service.excluir();
        String retorno3 = service.alterar();
        String retorno4 = service.buscar();
        Assert.assertEquals("Sucesso", retorno1);
        Assert.assertEquals("Sucesso", retorno2);
        Assert.assertEquals("Sucesso", retorno3);
        Assert.assertEquals("Sucesso", retorno4);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void ErroSalvarTest() {
        IContratoDao dao = new ContratoDao();
        ContratoService service = new ContratoService(dao);
        String retorno1 = service.salvar();
        String retorno2 = service.excluir();
        String retorno3 = service.alterar();
        String retorno4 = service.buscar();
        Assert.assertEquals("Sucesso", retorno1);
        Assert.assertEquals("Sucesso", retorno2);
        Assert.assertEquals("Sucesso", retorno3);
        Assert.assertEquals("Sucesso", retorno4);
    }
}
