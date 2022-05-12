
public class Card {
    private String id;
    private String name;
    private String description;
    private String cover;
    private Integer coverWidth;
    private Integer coverHeight;
    private String insideImage;
    private Double price;
    private Integer categoryId;
    private String categoryName;
    private String categoryTaxonomy;
    private Boolean availableFree;
    private String orientation;
    private Integer characters;
    private Boolean isCustom;
    private Object customCardInfo;
    private Double closedHeight;
    private Double closedWidth;
    private Double openHeight;
    private Double openWidth;
    private Double marginTop;
    private Double marginRight;
    private Double marginBottom;
    private Double marginLeft;
    private Integer fontSize;
    private String detailsSize;
    private String detailsEnvelope;
    private String detailsAuthor;
    private Boolean isInside;

    public Card(String id, String name, String description, String cover, Integer coverWidth, Integer coverHeight, String insideImage, Double price, Integer categoryId, String categoryName, String categoryTaxonomy, Boolean availableFree, String orientation, Integer characters, Boolean isCustom, Object customCardInfo, Double closedHeight, Double closedWidth, Double openHeight, Double openWidth, Double marginTop, Double marginRight, Double marginBottom, Double marginLeft, Integer fontSize, String detailsSize, String detailsEnvelope, String detailsAuthor, Boolean isInside) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.cover = cover;
        this.coverWidth = coverWidth;
        this.coverHeight = coverHeight;
        this.insideImage = insideImage;
        this.price = price;
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.categoryTaxonomy = categoryTaxonomy;
        this.availableFree = availableFree;
        this.orientation = orientation;
        this.characters = characters;
        this.isCustom = isCustom;
        this.customCardInfo = customCardInfo;
        this.closedHeight = closedHeight;
        this.closedWidth = closedWidth;
        this.openHeight = openHeight;
        this.openWidth = openWidth;
        this.marginTop = marginTop;
        this.marginRight = marginRight;
        this.marginBottom = marginBottom;
        this.marginLeft = marginLeft;
        this.fontSize = fontSize;
        this.detailsSize = detailsSize;
        this.detailsEnvelope = detailsEnvelope;
        this.detailsAuthor = detailsAuthor;
        this.isInside = isInside;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getCover() {
        return cover;
    }

    public Integer getCoverWidth() {
        return coverWidth;
    }

    public Integer getCoverHeight() {
        return coverHeight;
    }

    public String getInsideImage() {
        return insideImage;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public String getCategoryTaxonomy() {
        return categoryTaxonomy;
    }

    public Boolean getAvailableFree() {
        return availableFree;
    }

    public String getOrientation() {
        return orientation;
    }

    public Integer getCharacters() {
        return characters;
    }

    public Boolean getCustom() {
        return isCustom;
    }

    public Object getCustomCardInfo() {
        return customCardInfo;
    }

    public Double getClosedHeight() {
        return closedHeight;
    }

    public Double getClosedWidth() {
        return closedWidth;
    }

    public Double getOpenHeight() {
        return openHeight;
    }

    public Double getOpenWidth() {
        return openWidth;
    }

    public Double getMarginTop() {
        return marginTop;
    }

    public Double getMarginRight() {
        return marginRight;
    }

    public Double getMarginBottom() {
        return marginBottom;
    }

    public Double getMarginLeft() {
        return marginLeft;
    }

    public Integer getFontSize() {
        return fontSize;
    }

    public String getDetailsSize() {
        return detailsSize;
    }

    public String getDetailsEnvelope() {
        return detailsEnvelope;
    }

    public String getDetailsAuthor() {
        return detailsAuthor;
    }

    public Boolean getInside() {
        return isInside;
    }
}
