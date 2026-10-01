import dao.ClienteDao;
import mock.ClienteDaoMock;
import org.junit.Assert;
import org.junit.Test;
import service.ClienteService;

/**
 * @author gustavohmdm
 */

public class ClienteServiceTest {

    @Test
    public void salvarTest() {
        ClienteDaoMock mockDao = new ClienteDaoMock();
        ClienteService service = new ClienteService(mockDao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void ErroSalvarTest() {
        ClienteDao dao = new ClienteDao();
        ClienteService service = new ClienteService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }
}

//No primeiro teste passamos no contrutor a classe mock que retorna nulo.
//No segundo teste passamos a classe dao que retorna um erro.