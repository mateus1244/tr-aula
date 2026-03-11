package br.com.unipar.frameworks.command;

import br.unipar.frameworks.miniframework.CommandHandler;
import br.unipar.frameworks.miniframework.Request;
import br.unipar.frameworks.miniframework.Response;

public class SomaCommand implements CommandHandler {
    @Override
    public Response handle(Request request) {
        if(request.getArgs().size() < 2) {
            return Response.
                    badRequest("Uso deve ser: soma <num1> <num2>");
        }

        try {
            double num1 = Double.parseDouble(request.getArgs().get(0));
            double num2 = Double.parseDouble(request.getArgs().get(1));

            return Response.ok("Resultado:" + (num1 + num2));
        } catch (NumberFormatException e) {
            return Response.badRequest("Os argumentos devem ser números válidos.");
        }

    }
}
