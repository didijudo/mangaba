/* This file was generated by SableCC (http://www.sablecc.org/). */

package mangaba.node;

import mangaba.analysis.*;

@SuppressWarnings("nls")
public final class TNInteiro extends Token
{
    public TNInteiro()
    {
        super.setText("inteiro");
    }

    public TNInteiro(int line, int pos)
    {
        super.setText("inteiro");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TNInteiro(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTNInteiro(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TNInteiro text.");
    }
}
