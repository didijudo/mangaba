/* This file was generated by SableCC (http://www.sablecc.org/). */

package mangaba.node;

import mangaba.analysis.*;

@SuppressWarnings("nls")
public final class TMultiplica extends Token
{
    public TMultiplica()
    {
        super.setText("*");
    }

    public TMultiplica(int line, int pos)
    {
        super.setText("*");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TMultiplica(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTMultiplica(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TMultiplica text.");
    }
}