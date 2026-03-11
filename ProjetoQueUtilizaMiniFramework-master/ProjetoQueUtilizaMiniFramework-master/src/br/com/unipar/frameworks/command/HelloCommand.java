package br.com.unipar.frameworks.command;

import br.unipar.frameworks.miniframework.CommandHandler;
import br.unipar.frameworks.miniframework.Request;
import br.unipar.frameworks.miniframework.Response;

public class HelloCommand implements CommandHandler {
    @Override
    public Response handle(Request request) {
        String nome = request.getArgs().isEmpty() ?
                "World" : request.getArgs().get(0);
        return Response.ok("Hello " + nome + "!");
    }
}
