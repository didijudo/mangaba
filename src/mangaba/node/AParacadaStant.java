/* This file was generated by SableCC (http://www.sablecc.org/). */

package mangaba.node;

import mangaba.analysis.*;

@SuppressWarnings("nls")
public final class AParacadaStant extends PParacadaStant
{
    private PTipo _tipo_;
    private TIdentificador _identificador_;
    private PParacadaStant2 _paracadaStant2_;

    public AParacadaStant()
    {
        // Constructor
    }

    public AParacadaStant(
        @SuppressWarnings("hiding") PTipo _tipo_,
        @SuppressWarnings("hiding") TIdentificador _identificador_,
        @SuppressWarnings("hiding") PParacadaStant2 _paracadaStant2_)
    {
        // Constructor
        setTipo(_tipo_);

        setIdentificador(_identificador_);

        setParacadaStant2(_paracadaStant2_);

    }

    @Override
    public Object clone()
    {
        return new AParacadaStant(
            cloneNode(this._tipo_),
            cloneNode(this._identificador_),
            cloneNode(this._paracadaStant2_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAParacadaStant(this);
    }

    public PTipo getTipo()
    {
        return this._tipo_;
    }

    public void setTipo(PTipo node)
    {
        if(this._tipo_ != null)
        {
            this._tipo_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._tipo_ = node;
    }

    public TIdentificador getIdentificador()
    {
        return this._identificador_;
    }

    public void setIdentificador(TIdentificador node)
    {
        if(this._identificador_ != null)
        {
            this._identificador_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._identificador_ = node;
    }

    public PParacadaStant2 getParacadaStant2()
    {
        return this._paracadaStant2_;
    }

    public void setParacadaStant2(PParacadaStant2 node)
    {
        if(this._paracadaStant2_ != null)
        {
            this._paracadaStant2_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._paracadaStant2_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._tipo_)
            + toString(this._identificador_)
            + toString(this._paracadaStant2_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._tipo_ == child)
        {
            this._tipo_ = null;
            return;
        }

        if(this._identificador_ == child)
        {
            this._identificador_ = null;
            return;
        }

        if(this._paracadaStant2_ == child)
        {
            this._paracadaStant2_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._tipo_ == oldChild)
        {
            setTipo((PTipo) newChild);
            return;
        }

        if(this._identificador_ == oldChild)
        {
            setIdentificador((TIdentificador) newChild);
            return;
        }

        if(this._paracadaStant2_ == oldChild)
        {
            setParacadaStant2((PParacadaStant2) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}