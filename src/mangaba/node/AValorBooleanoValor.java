/* This file was generated by SableCC (http://www.sablecc.org/). */

package mangaba.node;

import mangaba.analysis.*;

@SuppressWarnings("nls")
public final class AValorBooleanoValor extends PValor
{
    private TBooleano _booleano_;

    public AValorBooleanoValor()
    {
        // Constructor
    }

    public AValorBooleanoValor(
        @SuppressWarnings("hiding") TBooleano _booleano_)
    {
        // Constructor
        setBooleano(_booleano_);

    }

    @Override
    public Object clone()
    {
        return new AValorBooleanoValor(
            cloneNode(this._booleano_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAValorBooleanoValor(this);
    }

    public TBooleano getBooleano()
    {
        return this._booleano_;
    }

    public void setBooleano(TBooleano node)
    {
        if(this._booleano_ != null)
        {
            this._booleano_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._booleano_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._booleano_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._booleano_ == child)
        {
            this._booleano_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._booleano_ == oldChild)
        {
            setBooleano((TBooleano) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
