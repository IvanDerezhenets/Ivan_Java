import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class responder
{
    @PostMapping
    public respond responding(@RequestBody request request)
    {
        respond respond = new respond();
        respond.putNum(request.numrandomizer());
        respond.putName(request.getName());
        return respond;
    }
}
