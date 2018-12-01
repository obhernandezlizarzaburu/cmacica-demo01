package pe.cmacica.labs.labs01.Controllers;

import pe.cmacica.labs.labs01.Services.ClienteService;

public class ClienteController {


    private ClienteService clienteService=new ClienteService();

    public void guardar()
    {
        clienteService.guardar();
    }
}
