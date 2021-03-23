/* This file was generated by SableCC (http://www.sablecc.org/). */

package mangaba.node;

import mangaba.analysis.*;

@SuppressWarnings("nls")
public final class AVariavelExprLogica extends PExprLogica
{
    private PVariavel _variavel_;

    public AVariavelExprLogica()
    {
        // Constructor
    }

    public AVariavelExprLogica(
        @SuppressWarnings("hiding") PVariavel _variavel_)
    {
        // Constructor
        setVariavel(_variavel_);

    }

    @Override
    public Object clone()
    {
        return new AVariavelExprLogica(
            cloneNode(this._variavel_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAVariavelExprLogica(this);
    }

    public PVariavel getVariavel()
    {
        return this._variavel_;
    }

    public void setVariavel(PVariavel node)
    {
        if(this._variavel_ != null)
        {
            this._variavel_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._variavel_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._variavel_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._variavel_ == child)
        {
            this._variavel_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._variavel_ == oldChild)
        {
            setVariavel((PVariavel) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
