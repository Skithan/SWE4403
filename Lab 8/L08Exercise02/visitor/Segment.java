public interface Segment {

    public String accept(Visitor visitor);
    public String reduceNoise();
    public String normalize();
    public String addReverb();
    
}
