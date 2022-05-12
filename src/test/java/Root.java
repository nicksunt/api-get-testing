import java.util.ArrayList;
import java.util.List;

public class Root {

    private List<Card> cards;
    private Integer discount;
    private Integer httpCode;
    private String status;

    public Root(List<Card> cards, Integer discount, Integer httpCode, String status) {
        this.cards = cards;
        this.discount = discount;
        this.httpCode = httpCode;
        this.status = status;
    }

    public List<Card> getCards() {
        return cards;
    }

    public Integer getDiscount() {
        return discount;
    }

    public Integer getHttpCode() {
        return httpCode;
    }

    public String getStatus() {
        return status;
    }

}