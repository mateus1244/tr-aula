package br.com.unipar.frameworks.command;

import br.unipar.frameworks.miniframework.CommandHandler;
import br.unipar.frameworks.miniframework.Request;
import br.unipar.frameworks.miniframework.Response;
import br.unipar.frameworks.miniframework.util.DateTimeUtil;

public class HoraCommand implements CommandHandler {
    @Override
    public Response handle(Request request) {
        return Response.ok("Hora atual: " + DateTimeUtil.getCurrentTime());
    }
}
