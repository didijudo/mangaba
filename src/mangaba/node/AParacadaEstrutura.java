/* This file was generated by SableCC (http://www.sablecc.org/). */

package mangaba.node;

import mangaba.analysis.*;

@SuppressWarnings("nls")
public final class AParacadaEstrutura extends PParacadaEstrutura
{
    private PParacadaStant _paracadaStant_;

    public AParacadaEstrutura()
    {
        // Constructor
    }

    public AParacadaEstrutura(
        @SuppressWarnings("hiding") PParacadaStant _paracadaStant_)
    {
        // Constructor
        setParacadaStant(_paracadaStant_);

    }

    @Override
    public Object clone()
    {
        return new AParacadaEstrutura(
            cloneNode(this._paracadaStant_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAParacadaEstrutura(this);
    }

    public PParacadaStant getParacadaStant()
    {
        return this._paracadaStant_;
    }

    public void setParacadaStant(PParacadaStant node)
    {
        if(this._paracadaStant_ != null)
        {
            this._paracadaStant_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._paracadaStant_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._paracadaStant_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._paracadaStant_ == child)
        {
            this._paracadaStant_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._paracadaStant_ == oldChild)
        {
            setParacadaStant((PParacadaStant) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}