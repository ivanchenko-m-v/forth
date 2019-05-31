import java.util.List;
import java.util.Stack;
import java.util.stream.IntStream;

public class ForthEvaluator
{
    private Stack<Integer> stackValues     = new Stack<>( );
    private Stack<Integer> stackOperations = new Stack<>( );

    public List<Integer> evaluateProgram( List<String> list )
    {
        this.parseOperations( list );
        return null;
    }

    private void parseOperations( List<String> list )
    {

    }
}
