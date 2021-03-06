/* This file was generated by SableCC (http://www.sablecc.org/). */

package mangaba.node;

import mangaba.analysis.*;

@SuppressWarnings("nls")
public final class ADeclaracaoFuncao extends PFuncao
{
    private PTipoFuncao _tipoFuncao_;
    private TIdentificador _identificador_;
    private PVariaveisFuncao _variaveisFuncao_;
    private PBlocoPrograma _blocoPrograma_;

    public ADeclaracaoFuncao()
    {
        // Constructor
    }

    public ADeclaracaoFuncao(
        @SuppressWarnings("hiding") PTipoFuncao _tipoFuncao_,
        @SuppressWarnings("hiding") TIdentificador _identificador_,
        @SuppressWarnings("hiding") PVariaveisFuncao _variaveisFuncao_,
        @SuppressWarnings("hiding") PBlocoPrograma _blocoPrograma_)
    {
        // Constructor
        setTipoFuncao(_tipoFuncao_);

        setIdentificador(_identificador_);

        setVariaveisFuncao(_variaveisFuncao_);

        setBlocoPrograma(_blocoPrograma_);

    }

    @Override
    public Object clone()
    {
        return new ADeclaracaoFuncao(
            cloneNode(this._tipoFuncao_),
            cloneNode(this._identificador_),
            cloneNode(this._variaveisFuncao_),
            cloneNode(this._blocoPrograma_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseADeclaracaoFuncao(this);
    }

    public PTipoFuncao getTipoFuncao()
    {
        return this._tipoFuncao_;
    }

    public void setTipoFuncao(PTipoFuncao node)
    {
        if(this._tipoFuncao_ != null)
        {
            this._tipoFuncao_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._tipoFuncao_ = node;
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

    public PVariaveisFuncao getVariaveisFuncao()
    {
        return this._variaveisFuncao_;
    }

    public void setVariaveisFuncao(PVariaveisFuncao node)
    {
        if(this._variaveisFuncao_ != null)
        {
            this._variaveisFuncao_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._variaveisFuncao_ = node;
    }

    public PBlocoPrograma getBlocoPrograma()
    {
        return this._blocoPrograma_;
    }

    public void setBlocoPrograma(PBlocoPrograma node)
    {
        if(this._blocoPrograma_ != null)
        {
            this._blocoPrograma_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._blocoPrograma_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._tipoFuncao_)
            + toString(this._identificador_)
            + toString(this._variaveisFuncao_)
            + toString(this._blocoPrograma_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._tipoFuncao_ == child)
        {
            this._tipoFuncao_ = null;
            return;
        }

        if(this._identificador_ == child)
        {
            this._identificador_ = null;
            return;
        }

        if(this._variaveisFuncao_ == child)
        {
            this._variaveisFuncao_ = null;
            return;
        }

        if(this._blocoPrograma_ == child)
        {
            this._blocoPrograma_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._tipoFuncao_ == oldChild)
        {
            setTipoFuncao((PTipoFuncao) newChild);
            return;
        }

        if(this._identificador_ == oldChild)
        {
            setIdentificador((TIdentificador) newChild);
            return;
        }

        if(this._variaveisFuncao_ == oldChild)
        {
            setVariaveisFuncao((PVariaveisFuncao) newChild);
            return;
        }

        if(this._blocoPrograma_ == oldChild)
        {
            setBlocoPrograma((PBlocoPrograma) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
