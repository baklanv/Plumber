package MyGame;

import org.jetbrains.annotations.NotNull;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class Field {

    private Map<Point, PipeSegment> pipeSegments = new HashMap<>();

    private int width;
    private int height;

    //нужны кран и резервуар
    public Field(int _width, int _height){
        if (_width == 0) throw new IllegalArgumentException("Field width must be more than 0");
        if (_height == 0) throw new IllegalArgumentException("Field height must be more than 0");

        width = _width;
        height = _height;

        setupField();
    }

    private void setupField(){

    }

    public PipeSegment getPipeSegment(@NotNull Point point){
        return pipeSegments.get(point);
    }
}
