

public class FactSegment implements Segment {


    public String accept(Visitor visitor){

        return visitor.visitFactSegment(this);
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

