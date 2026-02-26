import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class SmartTvHandler implements InvocationHandler {
    private final ISmartTv tvReal; // A TV verdadeira que estamos a proteger

    // Construtor: Recebe a quem deve proteger
    public SmartTvHandler(ISmartTv tvReal) {
        this.tvReal = tvReal;
    }

    // O portão de entrada de todos os comandos
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        // Ligar ou desligar passa sempre
        if (method.getName().equals("setOn_Off")) {
            return method.invoke(tvReal, args);
        }
        // A TV está ligada?
        else if (tvReal.isOn()) {
            return method.invoke(tvReal, args);
        }
        // TV desligada, lança a exceção
        else {
            throw new IllegalStateException("TV OFF");
        }
    }
}