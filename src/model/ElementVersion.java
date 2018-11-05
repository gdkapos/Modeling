public abstract class ElementVersion extends Element {
    private Element element;
    private Long versionNumber;
    
    public Element getElement() {
        return this.element;
    }
    
    public Long getVersion() {
        return this.versionNumber;
    }
}
