public class FormatSegment implements Segment{
    
    public String accept(Visitor visitor){

        return visitor.visitFormatSegment(this);
    }

    
    public String reduceNoise(){

        return " Reduce Noise ";
    }

    public String normalize(){

        return " Normalize ";
    }


    public String addReverb(){

        return " Add Reverb ";
    }


}
