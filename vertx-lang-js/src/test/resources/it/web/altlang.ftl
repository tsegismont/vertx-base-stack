Hello ${foo}
<#list bar as thing>
There is a ${thing}
</#list>
<#list baz?keys as k>
${k}
</#list>
<#list baz?values as v>
${v}
</#list>
<#list team.marseille as peep>
${peep} loves Olympique de Marseille
</#list>
