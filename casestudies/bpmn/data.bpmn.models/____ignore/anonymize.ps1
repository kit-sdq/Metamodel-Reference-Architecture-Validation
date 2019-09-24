cd "D:\eclipse_oxygen\ws-runtime-dissvali\data.bpmn.models\_ignore\Roman flat"
get-childItem -recurse -File *.bpmn | ForEach-Object {
    $fileContent = Get-Content $_ -Raw
    $fileContent = $fileContent -replace 'name="[^"]*"', 'name="redacted"' `
                                -replace 'documentation="[^"]*"', 'documentation="redacted"' `
                                -replace '<text>[^<]*<\/text>', '<text>redacted</text>' `
                                -replace '<documentation[^/]*<\/documentation>', '<documentation id="42">redacted</documentation>'
    Set-Content -Path $_ -Value $fileContent

#	(Get-Content $_)    -replace 'name="[^"]*"', 'name="redacted"' `
#                        -replace 'documentation="[^"]*"', 'documentation="redacted"' `
#                        -replace '<text>[^<]*<\/text>', '<text>redacted</text>' `
#                        -replace '<documentation[^/]*<\/documentation>', '<documentation id="42">redacted</documentation>' | Set-Content $_
}
Write-Host done
